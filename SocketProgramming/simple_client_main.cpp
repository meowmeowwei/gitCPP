#include "ClientSocket.h"
#include "SocketException.h"
#include <iostream>
#include <string>

int main ( int argc, char ** )
{
  try
    {

      ClientSocket client_socket ( "localhost", 30000 );

      std::string reply;
      std::string question; 

      try
	{
	  
    while (true){

       
       std::cout<<"Enter the next message you wan to send"<<std::endl;
       std::getline(std::cin, question);
       client_socket << question;
       client_socket >> reply;
       std::cout << "We received this response from the server:\n\"" << reply << "\"\n";;

    }
	 
	}
      catch ( SocketException& ) {}

      
    }
  catch ( SocketException& e )
    {
      std::cout << "Exception was caught:" << e.description() << "\n";
    }

  return 0;
}
