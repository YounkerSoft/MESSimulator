# MESSimulator
---
### Order  
 (目前只考虑一个订单只包含一种产品的情况) 
  
+ productID  
+ count （数量）
+ status [ suspend | executing | completed etc. ]    
+ orderTime  (下单时间)
+ completionTime  （完成时间）

### OrderManager  
 (The class manages all the orders, and mainly gets orders from order repository or DB)  
 
+ getXXXOrders() : get methods
+ notifyScheduler() : when new order is arriving, send a signal to PPS (Production Planing System)
   
### OrderGenerator  
 (Generating orders according to prefined rules)  
 
+ rule ( 按照一定间隔产生一定数量的订单)
  
### Product  
 (sweater，这里的产品指产品的型号，而不是生产出来的商品)  
 + ID  (产品类型，different types have different requirements)  
 + definition (产品的详细定义)
 
### ProductManager
 （管理不同的产品类型）  
  
### Machine
+ ID  
+ status  
+ 各个部件

### MachineManager  
(管理各个机器)

### MachineMonitor  
（全局的状态监控器）
  
### Scheduler  
（调度器） 
