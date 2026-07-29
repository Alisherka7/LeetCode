SELECT 
    ROUND(
        AVG(
            CASE
                WHEN 
                    order_date = customer_pref_delivery_date
                THEN
                    100.00
                ELSE
                    0.00
                END
        ), 2
    ) AS immediate_percentage
FROM (
    SELECT DISTINCT ON (customer_id) customer_id, order_date, customer_pref_delivery_date
    FROM Delivery
    ORDER BY customer_id, order_date
)
