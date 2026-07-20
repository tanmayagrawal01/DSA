# Write your MySQL query statement below
select a.name as Employee from Employee as e join Employee as a on e.id=a.managerId where e.salary<a.salary;