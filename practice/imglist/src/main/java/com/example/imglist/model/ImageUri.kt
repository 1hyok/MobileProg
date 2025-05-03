package com.example.imglist.model

sealed class ImageUri {//실드 클래스는 자식에 대해서만 객체를 생성해 주면 된다. 모든 하위 클래스는 같은 파일 내에 선언되어야 한다
    class ResImage(val resId:Int): ImageUri()
    class WebImage(val webId:String): ImageUri()
}
//상속 가능 조건
//    open 키워드가 붙은 클래스여야 함
//    인터페이스는 항상 상속 가능
//    abstract 클래스도 상속 가능