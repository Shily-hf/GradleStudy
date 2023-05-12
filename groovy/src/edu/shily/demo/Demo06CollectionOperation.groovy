package edu.shily.demo

//1.增：在集合中添加元素
def list=[5,6,7,8]
assert list instanceof java.util.List
list.add(12)
println list.size()
//2.增:集合与集合相加
def list2=[1,2,3,4]
println list.plus(list2)

//删:根据下标删除
list.remove(2)
println(list)

//删:删除集合中指定的元素
list.removeElement(12)
println(list)

//删:从list集合中移除list3集合中的元素
def list3=[6,8]
list.removeAll(list3)
println(list)

//删:从list表中弹出最后一个元素
println list.pop()
println(list)

//改:
list.putAt(2,10)
println(list)

//-------------------------list:增删改查操作---------------------------
[1,2,3].each {
    println "Item:$it"
}
//size():获取此列表中的元素数
println(list.size())
//contains():如果此列表包含指定的的值,则返回true
println(list.contains())

//-------------------------map:增删改查操作---------------------------
def map=[J:"java",K:"Kotlin",G:"Groovy"]

//增
map.put("P","Python")
//map.putAll():增加一个map集合

//删
map.remove("P")
map.remove("K","Kotlin")
println "删之后:"+map

//改:操作符重载
map2 = map - ["J":"java"]
println(map2)

map3 = map + ["G":"Gson"]//键相同会产生覆盖
println(map3)

//查
map.each {key,value->
    println "key:$key value:$value"
}


