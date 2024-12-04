drop table if exists role;
drop table if exists user;
drop table if exists user_roles;
-- Create the 'role' table
CREATE TABLE role (
    id BIGSERIAL PRIMARY KEY,          -- Use BIGSERIAL for auto-increment
    description VARCHAR(255),
    name VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS public."User1"
(
    id bigint NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 9223372036854775807 CACHE 1 ),
    username character varying COLLATE pg_catalog."default",
    email character varying COLLATE pg_catalog."default",
    phone character varying COLLATE pg_catalog."default",
    business_title character varying COLLATE pg_catalog."default",
    password character varying COLLATE pg_catalog."default"
)
-- Create the 'user_roles' table
CREATE TABLE user_roles (
    user_id BIGINT NOT NULL,
    role_id BIGINT NOT NULL,
    PRIMARY KEY (user_id, role_id),    -- Composite primary key
    CONSTRAINT fk_user FOREIGN KEY (user_id) REFERENCES users(id), -- Add foreign key
    CONSTRAINT fk_role FOREIGN KEY (role_id) REFERENCES role(id)   -- Add foreign key
);


INSERT INTO role (id, description, name) VALUES (4, 'Admin role', 'ADMIN');
INSERT INTO role (id, description, name) VALUES (5, 'User role', 'USER');

