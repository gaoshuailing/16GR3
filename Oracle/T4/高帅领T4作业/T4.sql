SQL> select abs(-9) from dual;

   ABS(-9)                                                                      
----------                                                                      
         9                                                                      

SQL> select ceil(454.42) from dual;

CEIL(454.42)                                                                    
------------                                                                    
         455                                                                    

SQL> select floor(11.99) from dual;

FLOOR(11.99)                                                                    
------------                                                                    
          11                                                                    

SQL> cos(30) from dual;
SP2-0734: 未知的命令开头 "cos(30) fr..." - 忽略了剩余的行。
SQL> select cos(30) from dual;

   COS(30)                                                                      
----------                                                                      
 .15425145                                                                      

SQL> select sin(60) from dual;

   SIN(60)                                                                      
----------                                                                      
-.30481062                                                                      

SQL> select power(5,5) from dual;

POWER(5,5)                                                                      
----------                                                                      
      3125                                                                      

SQL> select power(45465,6) from dual;

POWER(45465,6)                                                                  
--------------                                                                  
    8.8321E+27                                                                  

SQL> select round(45.9246) from dual;

ROUND(45.9246)                                                                  
--------------                                                                  
            46                                                                  

SQL> select trunc(45.152446,5) from dual;

TRUNC(45.152446,5)                                                              
------------------                                                              
          45.15244                                                              

SQL> select sqrt(9) from dual;

   SQRT(9)                                                                      
----------                                                                      
         3                                                                      

SQL> select concat('gao','shuai ling') from dual;

CONCAT('GAO','SHUAILING')                                                       
--------------------------                                                      
gaoshuai ling                                                                   

SQL> select substr('asdfghjkl','5'.'3') from dual;
select substr('asdfghjkl','5'.'3') from dual
                             *
第 1 行出现错误: 
ORA-00907: 缺失右括号 


SQL> select substr('asdfghjkl','5','3') from dual;

SUBSTR                                                                          
------                                                                          
ghj                                                                             

SQL> select ltrim('    fsafsdf') from dual;

LTRIM('FSAFSDF                                                                  
--------------                                                                  
fsafsdf                                                                         

SQL> select rttim('fsafa    ')from dual;
select rttim('fsafa    ')from dual
       *
第 1 行出现错误: 
ORA-00904: "RTTIM": 标识符无效 


SQL> select rtrim('fsafa    ')from dual;

RTRIM('FSA                                                                      
----------                                                                      
fsafa                                                                           

SQL> select length('fsadfsfhyfduysdgf') from fual;
select length('fsadfsfhyfduysdgf') from fual
                                        *
第 1 行出现错误: 
ORA-00942: 表或视图不存在 


SQL> select length('fsadfsfhyfduysdgf') from dual;

LENGTH('FSADFSFHYFDUYSDGF')                                                     
---------------------------                                                     
                         17                                                     

SQL> select uppoer('ghHHiif') from dual;
select uppoer('ghHHiif') from dual
       *
第 1 行出现错误: 
ORA-00904: "UPPOER": 标识符无效 


SQL> select uppoer('ghHHiif') from dual;
select uppoer('ghHHiif') from dual
       *
第 1 行出现错误: 
ORA-00904: "UPPOER": 标识符无效 


SQL> select upper('ghHHiif') from dual;

UPPER('GHHHIIF                                                                  
--------------                                                                  
GHHHIIF                                                                         

SQL> select lower('HJJKDFHJK') from dual;

LOWER('HJJKDFHJK')                                                              
------------------                                                              
hjjkdfhjk                                                                       

SQL> select initcap('gao') from dual;

INITCA                                                                          
------                                                                          
Gao                                                                             

SQL> select translata('gaoshuailing','g','j') from dual;
select translata('gaoshuailing','g','j') from dual
       *
第 1 行出现错误: 
ORA-00904: "TRANSLATA": 标识符无效 


SQL> select translate('gaoshuailing','g','j') from dual;

TRANSLATE('GAOSHUAILING'                                                        
------------------------                                                        
jaoshuailinj                                                                    

SQL> select instr('gaoshuailing','5') from dual;

INSTR('GAOSHUAILING','5')                                                       
-------------------------                                                       
                        0                                                       

SQL> select instr('gaoshuailing','s') from dual;

INSTR('GAOSHUAILING','S')                                                       
-------------------------                                                       
                        4                                                       

SQL> select replace('gaoaijie','5','gao') from dual;

REPLACE('GAOAIJI                                                                
----------------                                                                
gaoaijie                                                                        

SQL> select replace('gaoaijie','5','o') from dual;

REPLACE('GAOAIJI                                                                
----------------                                                                
gaoaijie                                                                        

SQL> select replace('gaoaijie','g','o') from dual;

REPLACE('GAOAIJI                                                                
----------------                                                                
oaoaijie                                                                        

SQL> select to_char(sysdte,'yyyy-mm-dd') from dual;
select to_char(sysdte,'yyyy-mm-dd') from dual
               *
第 1 行出现错误: 
ORA-00904: "SYSDTE": 标识符无效 


SQL> select to_char(sysdate,'yyyy-mm-dd') from dual;

TO_CHAR(SYSDATE,'YYY                                                            
--------------------                                                            
2018-03-19                                                                      

SQL> sele to_date('1997-02-15','yyyy-mm-dd') from dual;
SP2-0734: 未知的命令开头 "sele to_da..." - 忽略了剩余的行。
SQL> select to_date('1997-02-15','yyyy-mm-dd') from dual;

TO_DATE('1997-                                                                  
--------------                                                                  
15-2月 -97                                                                      

SQL> select to_number('$123,456,789.1','$999,999,999.9') from dual;

TO_NUMBER('$123,456,789.1','$999,999,999.9')                                    
--------------------------------------------                                    
                                   123456789                                    

SQL> select to_number('$123,458.91','$999,999,999.9') from dual;
select to_number('$123,458.91','$999,999,999.9') from dual
                 *
第 1 行出现错误: 
ORA-01722: 无效数字 


SQL> select to_number('$123,458.9','$,999,999.9') from dual;
select to_number('$123,458.9','$,999,999.9') from dual
                              *
第 1 行出现错误: 
ORA-01481: 无效的数字格式模型 


SQL> select to_number('$123,458.9','$999,999.9') from dual;

TO_NUMBER('$123,458.9','$999,999.9')                                            
------------------------------------                                            
                            123458.9                                            

SQL> select * from dept;

    DEPTNO DNAME                        LOC                                     
---------- ---------------------------- --------------------------              
        10 ACCOUNTING                   NEW YORK                                
        20 RESEARCH                     DALLAS                                  
        30 SALES                        CHICAGO                                 
        40 OPERATIONS                   BOSTON                                  

SQL> update dept set loc=boston where dname='研发部'
  2  
SQL> update dept set loc=boston where dname='研发部';
update dept set loc=boston where dname='研发部'
                    *
第 1 行出现错误: 
ORA-00904: "BOSTON": 标识符无效 


SQL> update dept set loc='研发部' where dname='sales';

已更新0行。

SQL> update dept set dname='研发部' where loc='BOSTON';

已更新 1 行。

SQL> select * from dept;

    DEPTNO DNAME                        LOC                                     
---------- ---------------------------- --------------------------              
        10 ACCOUNTING                   NEW YORK                                
        20 RESEARCH                     DALLAS                                  
        30 SALES                        CHICAGO                                 
        40 研发部                       BOSTON                                  

SQL> exit
