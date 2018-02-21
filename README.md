# Dagger2Test
inject data into class
測試Dagger2 2.10版之前的實作方式

## 內容 ##
CarModule提供Car.class所需的class
CarComponent提供注入CarModule的方法(Inject)
Car透過builde之後系統產生的DaggerCarComponent注入所需要的class

## 結果 ##
MainActivity新增Car之後資料由Dagger注入
Log會顯示創建的class
