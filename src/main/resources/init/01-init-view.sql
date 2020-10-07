-- ----------------------------
-- View structure for v_repertory
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
GROUP BY r.t_warehouseId, r.t_goodsId