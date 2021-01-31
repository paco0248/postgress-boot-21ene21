CREATE TABLE employee
(
 employeeName varchar(100) NOT NULL,
  employeeId varchar(11) NOT NULL ,
 employeeAddress varchar(100) DEFAULT NULL,
 employeeEmail varchar(100) DEFAULT NULL,
 PRIMARY KEY (employeeId)
);

CREATE TABLE cliente
(
 clienteName varchar(100) NOT NULL,
  clienteId varchar(11) NOT NULL ,
 clienteAddress varchar(100) DEFAULT NULL,
 clienteEmail varchar(100) DEFAULT NULL,
 PRIMARY KEY (clienteId)
);

