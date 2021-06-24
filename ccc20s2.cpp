//
//  main.cpp
//  test
//
//  Created by Andy Yan on 2020-05-16.
//  Copyright © 2020 Andy Yan. All rights reserved.
//

#include <bits/stdc++.h>

using namespace std;

typedef long long ll;
typedef long double ld;
typedef pair<int,int> pi;
typedef vector<int> vi;
typedef vector<string> vs;
typedef vector<pi> vpi;

#define mp make_pair
#define sz(x) (int)x.size()
#define pb push_back

int N,M;
vi v[1000001];
bool visited[1000001];
void dfs(int s){
    if(s==N*M){
        cout<<"yes"<<"\n";
        exit(0);
    }
    visited[s]=true;
    for(int i : v[s]){
        if(!visited[i]){
            dfs(i);
        }
    }

}

int main(){
    ios::sync_with_stdio(0);cin.tie(0);cout.tie(0);
    cin>>M>>N;
    for(int i = 1;i<=M;i++){
        for(int j = 1;j<=N;j++){
            int temp;
            cin>>temp;
            if(temp<= M*N){
                v[i*j].pb(temp);
            }
        }
    }
    dfs(1);
    cout<<"no"<<"\n";
    return 0;
}
