package security;

public class Credentials{
    private String      _username;
    private String      _password;
    
    private int         _oldPasswordCount;
    private String[]    _oldPasswords;
    
    public Credentials(String username, String password){
        _username = username;
        _password = password;
        _oldPasswordCount = 0;
        _oldPasswords = new String[100];
    }
    
    public String getUsername(){
        return _username;
    }
    
    public boolean matchPassword(String password){
        return _password.equals(password);
    }
    
    public boolean tryChangePassword(String oldPassword, String newPassword){
        
        if( ! matchPassword(oldPassword) ){
            return false;
        }
        
        if( matchPassword(newPassword) ) {
            return false;
        }
        
        for(int i = 0 ; i < _oldPasswordCount ; i++){
            if(_oldPasswords[i].equals(newPassword)){
                return false;            
            }
        }
    
        _oldPasswords[_oldPasswordCount++] = _password;
        _password = newPassword;
        return true;
    }
}