int firstUniqChar(char* s) {
    int n = strlen(s), flag, index = 0 ;
    for(int i=0; i<n; i++){
        flag = 0;
        for(int j = 0; j<n; j++){
            if(s[i] == s[j] && i != j){
                flag = 1;
                break;
            }
        }
        if(flag != 1){
            index = i;
            break;
        }
    }
    if(flag)
        return -1;
    else
        return index;

}