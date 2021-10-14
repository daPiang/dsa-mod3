/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod3assessment_dsa;
import javax.swing.JOptionPane;
public class queue {
    private String arr[];
	private int front,rear,capacity;
	
	public queue() {
		capacity = 5;
		arr = new String[capacity];
		front=rear=-1;
	}
	public queue(int setcap) {
		this.capacity = setcap;
		arr = new String[setcap];
		front=rear=-1;
	}
	public boolean isEmpty() {return rear==-1;}
	public boolean isFull() {return rear==capacity-1;}
	private void errorMessage(String msg) {
		JOptionPane.showMessageDialog(null, msg, "Full",
				JOptionPane.ERROR_MESSAGE);
	}
	public void enqueue(String element) {
		if(isFull()) {
			errorMessage("Queue is full!");
		}else {
			rear++;
			arr[rear] = element;
			front = 0;
		}
	}
	public boolean dequeue() {
		boolean checkIfEmpty = false;
		if(isEmpty()) {
			front=-1;
                        checkIfEmpty = true;
		}else {
			for(int i=0;i<rear;i++) {
				arr[i] = arr[i+1];
			}
			rear--;
		}	
		return checkIfEmpty;
	}
	public String display() {
		String hold="";
		if(!isEmpty()) {
			for(int i=front;i<=rear;i++) {
				hold+=arr[i];
			}
		}else {
			hold = "Queue is empty!";
		}
		return hold;
	}
	public String peek() {
		if(isEmpty()) {
			errorMessage("Queue is empty!");
                        return "";
		}else {
			return arr[rear];
		}
	}
	public String last() {
		if(isEmpty()) {
			errorMessage("Queue is empty!");
			return "";
		}else {
			return arr[rear];
		}
	}
        
        public void clear(){
            for(int i=0; i<arr.length; i++){
                boolean queueEmpty = dequeue();
                if(queueEmpty==true){
                    break;
                }
        }
        }
	public String frontValue() {return arr[front];}
	public String rearValue() {return arr[rear];}
	public int getCurrentSize() {return capacity-(capacity-(rear+1));}
	public int getCapacity() {return capacity;}
}
