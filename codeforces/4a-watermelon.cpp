#include <bits/stdc++.h>
using namespace std;

void solve() {
    int n; 
    cin >> n;
    if(!(n%2) && n!=2) cout << "YES";
    else cout << "NO";
}

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    int t = 1;
    // cin >> t;
    while(t--) {
        solve();
    }
    return 0;
}
