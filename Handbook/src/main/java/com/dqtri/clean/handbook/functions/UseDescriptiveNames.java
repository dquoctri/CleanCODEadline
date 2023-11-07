package com.dqtri.clean.handbook.functions;

public class UseDescriptiveNames {
    abstract class Employee {
        public abstract boolean isPayday();
        public abstract Money calculatePay();
        public abstract void deliverPay(Money pay);
    }

    interface EmployeeFactory {
        public Employee makeEmployee(EmployeeRecord r) throws InvalidEmployeeType;
    }

    class EmployeeFactoryImpl implements EmployeeFactory {
        public Employee makeEmployee(EmployeeRecord r) throws InvalidEmployeeType {
            switch (r.type) {
                case COMMISSIONED:
                    return new CommissionedEmployee(r);
                case HOURLY:
                    return new HourlyEmployee(r);
                case SALARIED:
                    return new SalariedEmploye(r);
                default:
                    throw new InvalidEmployeeType(r.type);
            }
        }
    }
























    class Money {

    }

    class InvalidEmployeeType extends Throwable {
        InvalidEmployeeType(Type t){

        }
    }

    class EmployeeRecord{
        Type type;
    }
    enum Type {
        COMMISSIONED, HOURLY, SALARIED
    }
    class CommissionedEmployee extends Employee {
        CommissionedEmployee(EmployeeRecord record) {

        }

        @Override
        public boolean isPayday() {
            return false;
        }

        @Override
        public Money calculatePay() {
            return null;
        }

        @Override
        public void deliverPay(Money pay) {

        }
    }

    class HourlyEmployee extends Employee {
        HourlyEmployee(EmployeeRecord record) {

        }

        @Override
        public boolean isPayday() {
            return false;
        }

        @Override
        public Money calculatePay() {
            return null;
        }

        @Override
        public void deliverPay(Money pay) {

        }
    }

    class SalariedEmploye extends Employee {
        SalariedEmploye(EmployeeRecord record) {

        }

        @Override
        public boolean isPayday() {
            return false;
        }

        @Override
        public Money calculatePay() {
            return null;
        }

        @Override
        public void deliverPay(Money pay) {

        }
    }
}
