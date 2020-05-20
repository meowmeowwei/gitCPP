# Merge Meetings

**Your company built an in-house calendar tool called HiCal. You want to add a feature to see the times in a day when** _**everyone**_ **is available.**

To do this, you’ll need to know when _any_ team is having a meeting. In HiCal, a meeting is stored as an instance of a Meeting class with integer member variables startTime and endTime. These integers represent the number of 30-minute blocks past 9:00am.

class Meeting { private: // number of 30 min blocks past 9:00 am unsigned int startTime_; unsigned int endTime_;

```cpp

  class Meeting
{
private:
    // number of 30 min blocks past 9:00 am
    unsigned int startTime_;
    unsigned int endTime_;

public:
    Meeting() :
        startTime_(0),
        endTime_(0)
    {
    }

    Meeting(unsigned int startTime, unsigned int endTime) :
        startTime_(startTime),
        endTime_(endTime)
    {
    }

    unsigned int getStartTime() const
    {
        return startTime_;
    }

    void setStartTime(unsigned int startTime)
    {
        startTime_ = startTime;
    }

    unsigned int getEndTime() const
    {
        return endTime_;
    }

    void setEndTime(unsigned int endTime)
    {
        endTime_ = endTime;
    }

    bool operator==(const Meeting& other) const
    {
        return
            startTime_ == other.startTime_
            && endTime_ == other.endTime_;
    }
};    


bool compareMeetingsByStartTime(const Meeting & firstMeeting, const Meeting & secondMeeting){
	return firstMeeting.getStartTime() < secondMeeting.getStartTime();
}


vector<Meeting> mergeRanges(vector <Meeting> & meetings){

 vector<Meeting> sortedMeetings(meetings);
 sort(sortedMeetings.begin(), sortedMeetings.end(), compareMeetingsByStartTime);

 vector<Meeting> mergedMeetings;
 mergedMeetings.push_back(sortedMeetings.front());

 for(Meeting & currentMeeting : sortedMeetings){
 	Meeting & lastMergedMeeting = mergedMeetings.back();

 	if(currentMeeting.getStartTime() <= lastMergedMeeting.getEndTime()){
 		lastMergedMeeting.setEndTime(max(lastMergedMeeting.getEndTime(), currentMeeting.getEndTime()));
 	}
 	else{
 		mergedMeetings.push_back(currentMeeting);
 	}
 }

 return mergedMeetings;

}

int main(){

 Meeting meeting1(0,1);
 Meeting meeting2(3,5);
 Meeting meeting3(4,8);
 Meeting meeting4(10,12);
 Meeting meeting5(9,10);	

 vector<Meeting> vec = {meeting1, meeting2, meeting3, meeting4, meeting5};

 vector<Meeting> overlap = mergeRanges(vec);
	
 for(Meeting x : overlap){
 	cout << x.getStartTime()<<", "<< x.getEndTime() << endl;
 }




```

