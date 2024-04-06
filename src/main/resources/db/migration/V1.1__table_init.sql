create table members
(
    id   bigint auto_increment primary key,
    name varchar(255) not null
);

create table order_line
(
    id           bigint auto_increment primary key,
    product_name varchar(50) not null,
    order_id     bigint
);

create table orders
(
    id        bigint auto_increment primary key,
    price     integer not null,
    member_id bigint
);

alter table order_line
    add constraint orders_order_line_fk foreign key (order_id) references orders (id);

alter table orders
    add constraint members_orders_fk foreign key (member_id) references members (id);