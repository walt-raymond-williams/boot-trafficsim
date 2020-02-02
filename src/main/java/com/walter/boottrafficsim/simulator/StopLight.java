/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trafficsimproject;

/**
 *
 * @author ww006
 */
public class StopLight {
    
    int[] connected1 = new int[2];
    int[] connected2 = new int[2];
    
    Nd waypointNode;
    
    StopLight(Nd node){
//        connected1[1]=0;
//        connected1[0]=1;
        this.waypointNode=node;
        calcTurnDir();
//        if(node.connections.size()==4){
//            this.waypointNode=node;
//            calcTurnDir();
//        }

    }
    
    private void calcTurnDir(){
        int turnDir=0;

            //A
            
            for(int firstConnect = 0; firstConnect<waypointNode.connections.size();firstConnect++){
            for(int connectionTurn = 0; connectionTurn<waypointNode.connections.size();connectionTurn++){
                if(firstConnect==connectionTurn){
                    break;
                }
                    double turn=(waypointNode.connections.get(connectionTurn).getLong()-waypointNode.connections.get(firstConnect).getLong())
                    *(waypointNode.getLat()-waypointNode.connections.get(firstConnect).getLat())
                    -(waypointNode.connections.get(connectionTurn).getLat()-waypointNode.connections.get(firstConnect).getLat())
                    *(waypointNode.getLong()-waypointNode.connections.get(firstConnect).getLong());
                    
                    if(turn>=-.00000001&&turn<=.00000001){
                        turnDir=0; 
                        
                        connected1[0]=firstConnect;
                        connected1[1]=connectionTurn;
                        
//                        if(connectionTurn==1){
//                            connected2[0]=2;
//                            connected2[1]=3;
//                        }if(connectionTurn==2){
//                            connected2[0]=1;
//                            connected2[1]=3;
//                        
//                        }
                        
                        return;
                        
                    }
                    
                    
                            

                        
                }

                
            }

                    
                    
            }


            


    }
    
    

