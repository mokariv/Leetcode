class Solution {
public:
    double averageWaitingTime(vector<vector<int>>& customers) {
        int n = customers.size();
        long long freeTill = 0, waitingTime=0;
        for(int i=0;i<n;i++){
            if(freeTill>customers[i][0]){
                waitingTime += (freeTill-customers[i][0]);
                freeTill = freeTill+customers[i][1];
            }else {
                freeTill = customers[i][0]+customers[i][1];
            }
            waitingTime+=customers[i][1];
        }
        return (double)waitingTime/n;
    }
};