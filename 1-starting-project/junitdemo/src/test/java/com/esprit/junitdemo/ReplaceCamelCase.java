package com.esprit.junitdemo;

import org.junit.jupiter.api.DisplayNameGenerator;

import java.lang.reflect.Method;

class ReplaceCamelCase extends DisplayNameGenerator.Standard {


    @Override
    public String generateDisplayNameForClass(Class<?> testClass) {
        return this.camelCase(super.generateDisplayNameForClass(testClass));
    }

    @Override
    public String generateDisplayNameForNestedClass(Class<?> nestedClass) {
        return this.camelCase(super.generateDisplayNameForNestedClass(nestedClass));
    }

    @Override
    public String generateDisplayNameForMethod(Class<?> testClass, Method testMethod) {
        return this.camelCase(testMethod.getName());
    }

    String camelCase(String camelCase)
    {
        StringBuilder result = new StringBuilder();
        result.append(camelCase.charAt(0));

        for(int i=1; i<camelCase.length();i++)
        {
            if(Character.isUpperCase(camelCase.charAt(i)))
            {
                result.append(' ');
                result.append(Character.toLowerCase(camelCase.charAt(i)));
            }

            else
            {
                result.append(camelCase.charAt(i));
            }


        }
        return result.toString();
    }


}
