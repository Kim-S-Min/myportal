CREATE TABLE members (
	no number PRIMARY KEY,
    name varchar(20) NOT NULL,
    email varchar(128) NOT NULL,
    password varchar(20) NOT NULL,
    gender char(1) DEFAULT 'M' check (gender in ('M', 'F')),
    joindate date DEFAULT sysdate
);

CREATE SEQUENCE seq_members_pk
    START WITH 1 INCREMENT BY 1 NOCACHE;

DESC members;

INSERT INTO members (no, name, email, password, gender)
VALUES(seq_members_pk.nextval, '홍길동', 'test@test.com', '1234', 'M');

SELECT * FROM members;
    
commit;