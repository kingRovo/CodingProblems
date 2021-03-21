
    import java.io.*; 
    import java.util.*; 
    
    class Parentheses 
    { 
        
        static boolean isValid(String s) 
        { 
            Stack<Character> stk = new Stack<>();
            for(int i = 0; i < s.length(); i++) {
            
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
              stk.push(s.charAt(i));
            else {
              if(stk.empty())
                return false;
              if(s.charAt(i) == ')' && stk.peek() != '(') return false;
                
              if(s.charAt(i) == ']' && stk.peek() != '[') return false;
                
              if(s.charAt(i) == '}' && stk.peek() != '{') return false;
                
              stk.pop();      
            }
          }
            
          return stk.empty();
        } 
    
        public static void main (String[] args) 
        { 
            String st = "a(())[]{{}}";
            System.out.println(isValid(st));
    
        } 
    } 
