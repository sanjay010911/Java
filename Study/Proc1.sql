create or replace procedure Proc1(name in varchar2,age in varchar2)
is
begin
	insert into login values(name,age);
end;
/