def call(String name,
        String dayOfWeek) 
        {
            sh '''
            echo hello world
            echo Sravan is a good boy
            hostname
            echo Hello ${name}. Today is ${dayOfWeek}
            '''
        }