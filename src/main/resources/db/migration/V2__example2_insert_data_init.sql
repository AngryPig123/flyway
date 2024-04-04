create table members
(
    id   bigint not null,
    name varchar(255),
    primary key (id)
);

create table order_line
(
    id       bigint not null,
    order_id bigint,
    primary key (id)
);

create table orders
(
    price     integer,
    id        bigint not null,
    member_id bigint,
    primary key (id)
);

alter table order_line
    add constraint orders_order_line foreign key (order_id) references orders (id);

alter table orders
    add constraint members_orders foreign key (member_id) references members (id);