SELECT s.student_id, s.student_name, sub.subject_name, COUNT(e.student_id) as attended_exams
FROM Students s
CROSS JOIN Subjects sub
LEFT JOIN Examinations e on e.student_id = s.student_id and e.subject_name = sub.subject_name
GROUP BY s.student_id, s.student_name, sub.subject_name
ORDER BY s.student_id, s.student_name, sub.subject_name
