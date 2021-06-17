#### OrderReceipt 
1. 重命名成员变量 o -> order： 命名不表意，难以阅读
2. 移除方法 printCustomerName 以及其上的注释： 该方法已经过时，且没人使用，难以阅读
3. 删除除类描述信息外的所有注释：代码已经描述清楚这个方法做了什么，注释是多余的
4. 修改 OrderReceipt 内命名不表意的地方：难以阅读
5. 抽取 printReceipt 方法中的for循环：代码过长
6. 数字，hardcode字符串：magic number

#### LineItem
1. 命名不表意：难以阅读

#### Order
1. 成员变量增加 private 修饰符：order内中的成员变量外部不应该能直接访问，要通过getter setter