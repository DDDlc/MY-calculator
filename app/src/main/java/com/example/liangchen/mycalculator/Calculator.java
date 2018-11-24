package com.example.liangchen.mycalculator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Calculator {
    private List<String> list = new ArrayList<>();

    public String button(String trans) {
        double finalresult=0;
        if(trans.equals("AC"))
            list.clear();
        else if(trans.equals("X")) {
            finalresult = evaluateExpression(list);
            finalresult = finalresult * finalresult;
            list.remove(list.size()-1);
            list.add(String.valueOf(finalresult));
        }
        else if (trans.equals("%")) {
            list.add("*");
            list.add("0.01");
            finalresult=evaluateExpression(list);
        }
        else if (!trans.equals("="))
            list.add(trans);
        else if(trans.equals("=")) {
            finalresult=evaluateExpression(list);
        }
        return String.valueOf(new BigDecimal(String.valueOf(finalresult)).stripTrailingZeros().toPlainString());
    }

    public static double evaluateExpression(List<String> expressionStr) {
        Stack<Double> operandStack = new Stack<Double>();
        Stack<Character> operatorStack = new Stack<>();
        String expression = insertBlank(expressionStr);
        String[] tokens = expression.split(" ");
        for (String token : tokens) {
            if (token.length() == 0) {
                continue;
            }
            char ch1 = token.charAt(0);
            switch (ch1) {
                case '+':
                case '-':
                    while (!operatorStack.isEmpty() && (operatorStack.peek() == '+' || operatorStack.peek() == '-' ||
                            operatorStack.peek() == '*' || operatorStack.peek() == '/')) {
                        processAnOperator(operandStack, operatorStack);
                    }
                    operatorStack.push(ch1);
                    break;
                case '*':
                case '/':
                    while (!operatorStack.isEmpty() && (operatorStack.peek() == '*' || operatorStack.peek() == '/')) {
                        processAnOperator(operandStack, operatorStack);
                    }
                    operatorStack.push(ch1);
                    break;
//                case '(':
//                    operatorStack.push(ch1);
//                    break;
//                case ')':
//                    while (!operatorStack.isEmpty() && operatorStack.peek() != '(') {
//                        processAnOperator(operandStack, operatorStack);
//                    }
//                    if (!operatorStack.isEmpty()) {
//                        operatorStack.pop();
//                    }
//                    break;
                default:
                    operandStack.push(new Double(token));
            }
        }
        while (!operatorStack.isEmpty()) {
            processAnOperator(operandStack, operatorStack);
        }
        return operandStack.pop();
    }

    private static void processAnOperator(Stack<Double> operandStack, Stack<Character> operatorStack) {
        char opr = operatorStack.pop();
        double op1 = operandStack.pop();
        double op2 = operandStack.pop();
        switch (opr) {
            case '+':
                operandStack.push(op2 + op1);
                break;
            case '-':
                operandStack.push(op2 - op1);
                break;
            case '*':
                operandStack.push(op2 * op1);
                break;
            case '/':
                operandStack.push(op2 / op1);
                break;
            default:
        }
    }

    private static String insertBlank(List<String> expressionStr) {
        String expression = "";
        for (String exp : expressionStr) {
            expression += exp;
        }
        String result = "";
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '(' || expression.charAt(i) == ')' || expression.charAt(i) == '/' ||
                    expression.charAt(i) == '*' || expression.charAt(i) == '-' || expression.charAt(i) == '+') {
                result += " " + expression.charAt(i) + " ";
            } else {
                result += expression.charAt(i);
            }
        }
        return result;
    }

}