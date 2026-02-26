
create or replace procedure "EXAMPLE"  (id IN  NUMBER,name IN VARCHAR2,addr IN VARCHAR2)  
as  
begin  

delete from std where sid=30;
update std set sname='krisha' where sid=40;
insert into std values(id,name,addr);

end; 
/