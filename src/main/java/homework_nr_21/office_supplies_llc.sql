CREATE TABLE departments (
    department_id INT PRIMARY KEY,
    department_name VARCHAR(50)
);

INSERT INTO departments(department_id, department_name)
values
(1, 'Administration'),
(2, 'Managment'),
(3, 'Accounting'),
(4, 'Logistic'),
(5, 'HR');

CREATE TABLE employees (
    employee_id INT PRIMARY KEY,
    employee_name VARCHAR(50),
    department_id INT,
    FOREIGN KEY (department_id) REFERENCES departments(department_id)
);

INSERT INTO employees (employee_id, employee_name, department_id)
values
(1, 'Ivanov Ivan', 1),
(2, 'Pupkina Ecaterina', 3),
(3, 'Biba Bobav ', 2),
(4, 'Boba Bibav', 2),
(5, 'Culai Denis', 4),
(6, 'Russu Eugeniu', null),
(7, 'Cusnir Olga', 5);

CREATE TABLE projects (
    project_id INT PRIMARY KEY,
    project_name VARCHAR(50)
);

INSERT INTO projects(project_id, project_name)
values
(1, 'State order for the government'),
(2, 'Government order for the army'),
(3, 'Order to school');

CREATE TABLE employee_projects (
    employee_id INT,
    project_id INT,
    FOREIGN KEY (employee_id) REFERENCES employees(employee_id),
    FOREIGN KEY (project_id) REFERENCES projects(project_id)
);

INSERT INTO employee_projects(employee_id, project_id)
values
(1, 2),
(3, 1),
(4, 3),
(5, 1),
(5, 2),
(5, 3),
(2, 3),
(2, 2),
(2, 1),
(6, 1),
(6, 3);

select e.employee_name  , d.department_name
from employees e
inner join departments d on e.department_id = d.department_id
order by e.employee_name;

select employee_id ,employee_name
from employees e
where department_id is null;

select p.project_name , e.employee_name
from projects p
inner join employee_projects ep on p.project_id = ep.project_id
inner join employees e on ep.employee_id = e.employee_id
order by p.project_name, e.employee_name ;

select e.employee_name  , d.department_name
from employees e
full join departments d on e.department_id = d.department_id
order by e.employee_name;

select d.department_name, count(e.employee_id) as employee_count
from departments d
left join employees e on d.department_id = e.department_id
group by d.department_name;
