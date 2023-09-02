package singleton;

public class Connection {

    private static Connection instance;

//     static {
//        instance = new Connection();
//    }

    public static Connection getInstance(){
        if(instance == null){
            instance = new Connection();
        }
        return instance;
    }

//    public synchronized Connection getInstance(){
//        if(instance == null){
//            instance = new Connection();
//
//        }
//        return instance;
//    }
//
//    public static  Connection getInstance(){
//         if(instance == null){
//             synchronized (Connection.class){
//                 if(instance == null ){
//                     instance = new Connection();
//                 }
//             }
//
//         }
//         return instance;
//    }


}
