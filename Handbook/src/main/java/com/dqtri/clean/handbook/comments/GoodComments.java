package com.dqtri.clean.handbook.comments;

public class GoodComments {
    //Comments Do Not Make Up for Bad Code


    //Explain Yourself in Code
    // Check to see if the employee is eligible for full benefits
    void doSomething(){
        if((employee.flags & Employee.HOURLY_FLAG)&&
                (employee.age >65)){

        }

        //    Or this?
        if(employee.isEligibleForFullBenefits());
    }

    //Good Comments
//Some comments are necessary or beneficial. We’ll look at a few that I consider worthy of
//the bits they consume. Keep in mind, however, that the only truly good comment is the
//comment you found a way not to write.

//           Legal Comments
    // Copyright (C) 2003,2004,2005 by Object Mentor, Inc. All rights reserved.
// Released under the terms of the GNU General Public License version 2 or later.

    Employee employee;
    class Employee {
        boolean flags;
        int age;
        static final boolean HOURLY_FLAG = true;

        boolean isEligibleForFullBenefits(){
            return (flags & HOURLY_FLAG) && (age >65);
        }
    }
}
