CREATE TABLE board (
	no number PRIMARY KEY,
    title varchar2(128) NOT NULL,
    content varchar2(255) NOT NULL,
    hit number DEFAULT 0,
    reg_date date DEFAULT sysdate,
    member_no number NOT NULL
);

CREATE SEQUENCE seq_board_pk
    START WITH 1
    INCREMENT BY 1
    NOCACHE;
    
-- 실제 사용자 정보 확인
SELECT * FROM members;

-- 1
INSERT INTO board
    (no, title, content, hit, member_no)
VALUES
    (seq_board_pk.nextval,
    '첫번째 게시물',
    '첫번째 게시물입니다',
    0,
    1);
    
DESC board;

SELECT * FROM board;

commit;