--회원 번호 시퀀스(PRIMARY KEY)
CREATE SEQUENCE USERNOSQ NOCACHE;

CREATE TABLE USERDATA(
	USERNO NUMBER NOT NULL,
	USERID VARCHAR2(500) NOT NULL,
	USERPW VARCHAR2(500) NOT NULL,
	USERNAME VARCHAR2(1000) NOT NULL,
	USERADDR VARCHAR2(4000) NOT NULL,
	USERPHONE VARCHAR2(4000) NOT NULL,
	USEREMAIL VARCHAR2(100) NOT NULL,
	USERENABLED VARCHAR2(2) NOT NULL,
	USERROLE VARCHAR2(50) NOT NULL,
	USERFOLLOW NUMBER NOT NULL,
	CONSTRAINT USERDATA_PK PRIMARY KEY(USERNO),
	CONSTRAINT USERDATA_UQ_ID UNIQUE(USERID),
	CONSTRAINT USERDATA_UQ_PHONE UNIQUE(USERPHONE),
	CONSTRAINT USERDATA_UQ_EMAIL UNIQUE(USEREMAIL),
	CONSTRAINT USERDATA_ENABLE_CHK CHECK(USERENABLED IN('Y','N'))
);

INSERT INTO USERDATA 
VALUES(USERNOSQ.NEXTVAL, 'USER1','1234','조현진','인천시 연수구 동춘동','010-8445-7471','85whguswls@naver.com','Y','USER',0);

--글 번호 시퀀스(PRIMARY KEY)
CREATE SEQUENCE BOARDNOSQ NOCACHE;

--그룹 번호 시퀀스(새로운 글 등록 할 때만)
CREATE SEQUENCE GROUPNOSQ NOCACHE;

CREATE TABLE USERCONTENT(
	BOARDNO NUMBER NOT NULL,
	GROUPNO NUMBER NOT NULL,
	GROUPSQ NUMBER NOT NULL,
	TITLE VARCHAR2(2000) ,
	CONTENT VARCHAR2(4000),
	USERID NUMBER NOT NULL, 
	USERIMGNAME VARCHAR2(50),
	USERIMG VARCHAR2(100),
	USERLIKE NUMBER NOT NULL,
	REGDATE DATE NOT NULL,
	CONSTRAINT USERCONTENT_PK PRIMARY KEY(BOARDNO),
	CONSTRAINT USERCONTENT_FK FOREIGN KEY(USERID) REFERENCES USERDATA(USERNO)
);

INSERT INTO USERCONTENT 
VALUES(BOARDNOSQ.NEXTVAL,GROUPNOSQ.NEXTVAL,1,'로고 사진1','로고사진',1,'logo_wyw.png','',0,SYSDATE);

CREATE TABLE USERFOLLOW(
   FOLLOWNO NUMBER NOT NULL,
   FOLLOWUSER NUMBER NOT NULL,
   FOLLOWINGUSER NUMBER NOT NULL,
   CONSTRAINT FOLLOWNO_PK PRIMARY KEY(FOLLOWNO),
   CONSTRAINT FOLLOWUSER_FK FOREIGN KEY(FOLLOWUSER) REFERENCES USERDATA(USERNO),
   CONSTRAINT FOLLOWINGUSER_FK FOREIGN KEY(FOLLOWINGUSER) REFERENCES USERDATA(USERNO)
);

SELECT * FROM USERCONTENT ORDER BY GROUPNO DESC, GROUPSQ;

SELECT * FROM USERDATA;

DROP TABLE USERDATA CASCADE CONSTRAINTS;
DROP TABLE USERCONTENT;
DROP TABLE USERFOLLOW;
DROP SEQUENCE USERNOSQ;
DROP SEQUENCE GROUPNOSQ;
DROP SEQUENCE BOARDNOSQ;



INSERT INTO USERDATA VALUES(
USERNOSQ.NEXTVAL, 'ADMIN', 'ADMIN123', '관리자', '서울시 중랑구', '010-1234-1234', 'ADMIN123@NAVER.COM', 'Y', 'MANAGER', 0);

INSERT INTO USERDATA VALUES(
USERNOSQ.NEXTVAL, 'USER1', 'USER123', '홍길동', '서울시 서초구', '010-1234-4321', 'USER1@GAMIL.COM', 'Y', 
'USER', 0
);
