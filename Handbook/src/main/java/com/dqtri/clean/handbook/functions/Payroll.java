package com.dqtri.clean.handbook.functions;

public class Payroll {
    public Money calculatePay(Employee e) throws InvalidEmployeeType {
        switch (e.type) {
            case COMMISSIONED:
                return calculateCommissionedPay(e);
            case HOURLY:
                return calculateHourlyPay(e);
            case SALARIED:
                return calculateSalariedPay(e);
            default:
                throw new InvalidEmployeeType(e.type);
        }
    }






    enum Type {
        COMMISSIONED, HOURLY, SALARIED
    }

    class Money{

    }

    class Employee {
        Type type;
    }

    class InvalidEmployeeType extends Throwable{
        InvalidEmployeeType(Type type){

        }
    }

    Money calculateCommissionedPay(Employee e){
        return null;
    }

    Money calculateHourlyPay(Employee e){
        return null;
    }

    Money calculateSalariedPay(Employee e){
        return null;
    }
}
