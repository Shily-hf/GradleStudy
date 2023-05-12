package edu.shily.demo

def obj = new Demo01BasicNotice()
def bookname = obj.bookname
println(bookname)

def description = obj.description
println(description)

def sale = obj.sale(100)
println(sale)

def sum = obj.sum(1, 2)
println(sum)

