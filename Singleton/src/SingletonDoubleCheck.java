public class SingletonDoubleCheck
{

        private static volatile SingletonDoubleCheck obj  = null;

        private SingletonDoubleCheck() {}

        public static SingletonDoubleCheck getInstance()
        {
            if (obj == null)
            {
                // To make thread safe
                synchronized (SingletonDoubleCheck.class)
                {
                    if (obj==null)
                        obj = new SingletonDoubleCheck();
                }
            }
            return obj;
        }
}

