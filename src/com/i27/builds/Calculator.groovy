package com.i27.builds;
class Calculator {
    def jenkins
    Calculator(jenkins) {
        this.jenkins = jenkins
    }

    def add(firstNumber, secondNumber) {
        return firstNumber + secondNumber
   }
}
