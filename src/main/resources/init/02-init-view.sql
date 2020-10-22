-- ----------------------------
-- 库存视图
-- ----------------------------
DROP VIEW IF EXISTS `v_repertory`;
CREATE VIEW `v_repertory` AS
SELECT
    r.t_warehouseId, r.t_goodsId, sum(r.t_num) AS t_num
FROM(
        (SELECT
             sgr.t_goodsId AS t_goodsId,
             sr.t_warehouseId AS t_warehouseId,
             sgr.t_num AS t_num
         FROM
             t_save_goods_record AS sgr
             LEFT JOIN t_save_record AS sr ON sgr.t_recordId = sr.t_id
        )
        UNION ALL
        (SELECT
             fgr.t_goodsId AS t_goodsId,
             fr.t_warehouseId AS t_warehouseId,
             fgr.t_num * (-1) AS t_num
         FROM
             t_fetch_goods_record AS fgr
             LEFT JOIN t_fetch_record AS fr ON fgr.t_recordId = fr.t_id
        )
    ) AS r
GROUP BY r.t_warehouseId, r.t_goodsId;

-- ----------------------------
-- 库存存储种类总数统计视图
-- ----------------------------
DROP VIEW IF EXISTS `v_statistics`;
CREATE VIEW `v_statistics` AS
SELECT
    t.t_warehouseId, w.t_name AS t_warehouseName, t.t_num, t.t_types
FROM(
    SELECT
        tmp.t_warehouseId, sum(tmp.t_num) AS t_num, COUNT(tmp.t_goodsId) AS t_types
    FROM(
        SELECT
            r.t_warehouseId, r.t_goodsId, sum(r.t_num) AS t_num
        FROM(
            (SELECT
                sgr.t_goodsId AS t_goodsId,
                sr.t_warehouseId AS t_warehouseId,
                sgr.t_num AS t_num
            FROM
                t_save_goods_record AS sgr
                LEFT JOIN t_save_record AS sr ON sgr.t_recordId = sr.t_id
            )
            UNION ALL
            (SELECT
                fgr.t_goodsId AS t_goodsId,
                fr.t_warehouseId AS t_warehouseId,
                fgr.t_num * (-1) AS t_num
            FROM
                t_fetch_goods_record AS fgr
                LEFT JOIN t_fetch_record AS fr ON fgr.t_recordId = fr.t_id
            )
        ) AS r
        GROUP BY r.t_warehouseId, r.t_goodsId
        ) AS tmp
    GROUP BY tmp.t_warehouseId
    ) AS t
LEFT JOIN t_warehouse AS w ON w.t_id = t.t_warehouseId;