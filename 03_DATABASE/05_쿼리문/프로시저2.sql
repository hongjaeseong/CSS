-- -----------------------------
-- 반환값 지정
-- -----------------------------
drop procedure proc_output_01;
delimiter $$
create procedure proc_output_01(in h_val int, out o_val char(100))		-- h_val(height value), o_val(out value)
begin
	select userid into o_val from usertbl where height = h_val;
end $$
delimiter ;

set @o_value = '';
call proc_output_01(174, @o_value);
select @o_value;