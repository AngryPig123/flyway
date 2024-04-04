create table members
(
    id   bigint not null auto_increment primary key,
    name varchar(255)
);

create table order_line
(
    id       bigint not null auto_increment primary key,
    order_id bigint
);

create table orders
(
    id        bigint not null auto_increment primary key,
    price     integer,
    member_id bigint
);

alter table order_line
    add constraint orders_order_line foreign key (order_id) references orders (id);

alter table orders
    add constraint members_orders foreign key (member_id) references members (id);