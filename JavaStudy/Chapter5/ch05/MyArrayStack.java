package ch05;

import ch03.MyArray;

public class MyArrayStack {

    // 멤버변수는 자동으로 초기화 됨
    MyArray arrayStack; // 객체인 경우 null
    int top; // 0

    public MyArrayStack(){
        top = 0;
        arrayStack = new MyArray();
    }

    public MyArrayStack(int size){
        top = 0;
        arrayStack = new MyArray(size);
    }

    public void push(int data){

        if(isFull()){
            System.out.println("stack is full");
            return;
        }
        arrayStack.addElement(data);
        top++;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return MyArray.ERROR_NUM;
        }
        return arrayStack.removeElement(--top);
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return MyArray.ERROR_NUM;
        }
        return arrayStack.getElement(--top);
    }

    public boolean isFull(){ // 가득 차있는지 확인
        if(top == arrayStack.ARRAY_SIZE){
            return true;
        }
        else return false;
    }

    public boolean isEmpty(){ // 비어있는지 확인

        if(top == 0){
            return true;
        }
        else return false;
    }

    public void printAll(){
        arrayStack.printAll();
    }
}
