class Solution {
public:
    bool wordPattern(string pattern, string s) {
        vector<string> v;

            // separate the string with the whitespaces 
            stringstream ss(s);
            string word;
            while( ss >> word ) v.push_back( word );

            // if data is insufficient 
            if (v.size() != pattern.size()) return false;

            unordered_map<char, string> m;
            set<string> st;

            for (int i = 0; i < pattern.size(); i++){

                if (m.find(pattern[i]) != m.end()){
                	// pattern = "abba", s = "dog cat cat fish"
                    if (m[pattern[i]] != v[i]) return false;
                }
                else{
                    // if any of the alphabet have'nt matched with string
                    if (st.count(v[i]) > 0) return false;
                    m[pattern[i]] = v[i];
                    st.insert(v[i]);
                }
            }

            return true;
    }
};