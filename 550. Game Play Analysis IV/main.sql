SELECT
    ROUND(
        AVG(
            CASE
                WHEN
                    EXISTS(
                        SELECT 1
                        FROM Activity b
                        WHERE b.player_id = a.player_id AND b.event_date = a.event_date + 1
                    )
                    THEN 1 ELSE 0
                END
        ),2
    ) AS fraction
FROM (
        SELECT DISTINCT ON (player_id) player_id, event_date
        FROM Activity
        ORDER BY player_id, event_date
    ) AS a
