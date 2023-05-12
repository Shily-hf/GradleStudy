package edu.shily.demo

/**
 * 闭包:
 *  定义:是一个开放的,匿名的代码块,它可以接受参数,也可以有返回值.闭包可以引用其周围声明的变量
 *  语法:{[closureParameters->] statements}
 *  调用:
 *      第一步:将闭包赋值给一个变量
 *      第二步:变量名() 变量名.call()
 *
 *   闭包在实际开发中的使用:作为方法的参数使用
 */

def running(Closure closure){
    println("running start......")
    closure()
    println("running end......")
}

running({[println("runnning............")]})

def caculate(Closure closure){
    def num1=10
    def num2=20
    closure(num1,num2)
}
caculate {k,v->println("$k+$v=${k+v}")}
//闭包作为方法的最后一个参数，那么闭包可以写在方法外边
def caculate1(num1,num2,Closure closure){
    closure(num1,num2)
}
caculate1 (10,16,{k,v->println("$k+$v=${k+v}")})
