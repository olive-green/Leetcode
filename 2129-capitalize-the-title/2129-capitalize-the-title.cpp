class Solution {
public:
    string capitalizeTitle(string word) {
        //approach
   string ans="";
   int idx=0;
   
   while(idx < word.length())
   {
   	  if(idx<word.length() and (word[idx]>='A' and word[idx]<='Z') or (word[idx]>='a' and word[idx]<='z'))
   	  {
 	    string str="";
   	  	while(idx<word.length() and (word[idx]>='A' and word[idx]<='Z') or (word[idx]>='a' and word[idx]<='z'))
   	  	{
   	  		str.push_back(tolower(word[idx]));
   	  		idx++;
        }
        if(str.length() <= 2)
        {
        	ans=ans+str;
            if(idx<word.length())
            {
                ans.push_back(' ');
            }
		}
		else if(str.length() > 2)
		{
			str[0]=toupper(str[0]);
			ans=ans+str;
            if(idx<word.length())
            {
                ans.push_back(' ');
            }
		}
      }
      while(idx<word.length() and word[idx]==' ')
      {
      	idx++;
	  }
   }
   return ans;
        
    }
};