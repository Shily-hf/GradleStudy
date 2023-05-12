package edu.shily.demo


/**
 * 1.Groovy使用def定义属性、方法，def支持动态类型声明
 * 2.单行注释// 多行注释/**
 * 3.groovy语句最后面的分号可以省略
 * 4.groovy可以自动为属性生成getter、setter方法
 * 5.方法声明时：参数类型、返回值类型、return关键字可以省略，在不引起歧义的地方（）括号可以省略
 * 6.变量引用时：在不引起歧义的前提下{}大括号也可以省略
 * 7.对象属性赋值：
 *      方式1：对象.属性名=
 *      方式2：对象["属性名"]=
 *      方式3：对象.属性setter方法（）
 *      方式4：具名构造器的方式
 *  读取属性值：
 *      方式1：对象.属性名
 *      方式2：对象["属性名"]
 *      方式3：对象.属性getter方法（）
 */

class Demo01BasicNotice {

    def description="斗破苍穹"

    def bookname="斗罗大陆"

    def sale(price){
        "the book is $price"
    }

    def sum(price1,price2){
        "$price1 + $price2 = ${price1+price2}"
    }
}
