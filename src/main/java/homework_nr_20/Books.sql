create table leased_books(
lease_id serial primary key,
book_id int,
date_of_lease date,
date_of_return date,
constraint book_id foreign key (book_id) references Books(book_id)
);

select *
from leased_books ;

insert into leased_books(book_id,date_of_lease,date_of_return)
values(1,'20240101','20240115'),
(4,'20240203','20240204'),
(3,'20240302','20240401'),
(5,'20240521','20240522');

select *
from books b
left join leased_books lb on b.book_id = lb.book_id
where lb.book_id is null;

select *
from books b
full join leased_books lb on b.book_id = lb.book_id;

select name,author,date_of_return
from books b
inner join leased_books lb on b.book_id = lb.book_id
where name is not null
 and author is not null
 and lb.date_of_return is not null;

select name,author,date_of_return
from books b
inner join leased_books lb on b.book_id = lb.book_id
where name like '_A%' or name like 'A%'
and name like '%ee%'
and author is not null
 and lb.date_of_return is not null;


