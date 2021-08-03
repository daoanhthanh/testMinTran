
create table features
(
    id          integer       not null
        constraint features_pkey
            primary key,
    description varchar(6000),
    method      varchar(10)   not null,
    name        varchar(100)  not null,
    path        varchar(5000) not null,
    point       integer       not null,
    status      varchar(20)   not null
);

create table groups
(
    id          integer      not null
        constraint groups_pkey
            primary key,
    description varchar(200),
    module_id   integer      not null,
    name        varchar(100) not null
);

create table groups_features
(
    id         integer not null
        constraint groups_features_pkey
            primary key,
    feature_id integer not null,
    group_id   integer not null
);

create table modules
(
    id          integer      not null
        constraint modules_pkey
            primary key,
    description varchar(200),
    name        varchar(100) not null
);