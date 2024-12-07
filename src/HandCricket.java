import java.util.*;
public class HandCricket
{
    @SuppressWarnings({ "resource", "unused" })
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the player1's name");
        String p1=sc.next();
        System.out.println("Enter the player2's name");
        String p2=sc.next();
        System.out.println("Enter the choice for player1 /n 1.for even /n 2.for odd");
        int c=sc.nextInt();
        int choice,runs1=0,runs2=0,target=0,i=0,j=0,x=0,y=0,a,b,s=0,e,d;
        if(c==1)
        {
            System.out.println("player1 chooses even");
            System.out.println("player2 chooses odd");
            System.out.println("Enter a number for player1");
            a=sc.nextInt();
            System.out.println("Enter a number for player2");
            b=sc.nextInt();
            s=a+b;
            if(s%2==0)
            {
                System.out.println("Wow ! player1 wins");
                System.out.println("Better luck next time player2");
                System.out.println("Enter a choice for player1 /n 1.for batting /n 2.for bowling");
                choice=sc.nextInt();
                if(choice==1)
                {
                    System.out.println("OK ! player1 chooses for batting");
                    System.out.println("Now the first innings is starting");
                    for(i=1;i<=6;i++)
                    {
                        e=0;d=0;
                        System.out.println("Enter a number for generating a number fot player1");
                        e=sc.nextInt();
                        x=1+(int)(Math.random()*6);
                        System.out.println("The generated number for player1 is:"+x);
                        runs1=runs1+x;
                        System.out.println("Enter a number for generating a number for player2");
                        d=sc.nextInt();
                        y=1+(int)(Math.random()*6);
                        System.out.println("The generated number for player2 is:"+y);
                        if(x==y)
                        {
                            System.out.println("oohh ! That's out");
                            System.out.println("Total runs made by player1 is:"+runs1);
                            target=runs1+1;
                            System.out.println("Now the target for player2 is:"+target);
                            break;
                        }
                    }
                    System.out.println("Total runs made by player1 is:"+runs1);
                    target=runs1+1;
                    System.out.println("Now the target for player2 is:"+target);
                    System.out.println("Cheerup guys ! the second innings is starting");
                    for(j=1;j<=6;j++)
                    {
                        e=0;d=0;
                        System.out.println("Enter a number for generating a number for player2");
                        d=sc.nextInt();
                        y=1+(int)(Math.random()*6);
                        System.out.println("The generated number for player2 is:"+y);
                        runs2=runs2+y;
                        System.out.println("Enter a number for generating a number for player1");
                        e=sc.nextInt();
                        x=+(int)(Math.random()*6);
                        System.out.println("The generated number for player1 is:"+x);
                        if(y==x)
                        {
                            System.out.println("oohh ! That's out");
                            System.out.println("Total runs made by player2 is:"+runs2);
                            if(target==runs2)
                            {
                            System.out.println("oohh ! It's a draw");
                            break;
                            }   
                            else
                            {
                                System.out.println("Wow ! player1 wins ");
                                System.out.println("Better luck next time player2");
                                break;
                            }
                        }
                        else if(runs2>target)
                        {
                            System.out.println("Wow ! player2 wins");
                            System.out.println("Better luck next time player1");
                            break;
                        }
                    }
                }
                else if(choice==2)
                {
                    System.out.println("OK ! player1 chooses for bowling");
                    System.out.println("Now the first innings is starting");
                    for(i=1;i<=6;i++)
                    {
                        e=0;d=0;
                        System.out.println("Enter a number for generating a number fot player2");
                        d=sc.nextInt();
                        y=1+(int)(Math.random()*6);
                        System.out.println("The generated number for player2 is:"+x);
                        runs2=runs2+y;
                        System.out.println("Enter a number for generating a number for player1");
                        e=sc.nextInt();
                        x=1+(int)(Math.random()*6);
                        System.out.println("The generated number for player21is:"+y);
                        if(y==x)
                        {
                            System.out.println("oohh ! That's out");
                            System.out.println("Total runs made by player2 is:"+runs2);
                            target=runs2+1;
                            System.out.println("Now the target for player1 is:"+target);
                            break;
                        }
                    }
                    System.out.println("Total runs made by player2 is:"+runs2);
                    target=runs1+1;
                    System.out.println("Now the target for player1 is:"+target);
                    System.out.println("Cheerup guys ! the second innings is starting");
                    for(j=1;j<=6;j++)
                    {
                        e=0;d=0;
                        System.out.println("Enter a number for generating a number for player1");
                        e=sc.nextInt();
                        x=1+(int)(Math.random()*6);
                        System.out.println("The generated number for player1 is:"+x);
                        runs1=runs1+x;
                        System.out.println("Enter a number for generating a number for player2");
                        d=sc.nextInt();
                        y=1+(int)(Math.random()*6);
                        System.out.println("The generated number for player2 is:"+y);
                        if(y==x)
                        {
                            System.out.println("oohh ! That's out");
                            System.out.println("Total runs made by player1 is:"+runs1);
                            if(target==runs1)
                            {
                            System.out.println("oohh ! It's a draw");
                            break;
                            }   
                            else
                            {
                                System.out.println("Wow ! player2 wins ");
                                System.out.println("Better luck next time player1");
                                break;
                            }
                        }
                        else if(runs1>target)
                        {
                            System.out.println("Wow ! player1 wins");
                            System.out.println("Better luck next time player2");
                            break;
                        }
                }
            }
            else
            {
                System.out.println("The entered choice is wrong");   
            }
        }
        else
        {
            System.out.println("Wow ! player2 wins");
                System.out.println("Better luck next time player1");
                System.out.println("Enter a choice for player2 /n 1.for batting /n 2.for bowling");
                choice=sc.nextInt();
                if(choice==1)
                {
                    System.out.println("OK ! player2 chooses for batting");
                    System.out.println("Now the first innings is starting");
                    for(i=1;i<=6;i++)
                    {
                        e=0;d=0;
                        System.out.println("Enter a number for generating a number fot player2");
                        d=sc.nextInt();
                        y=1+(int)(Math.random()*6);
                        System.out.println("The generated number for player2 is:"+x);
                        runs2=runs2+y;
                        System.out.println("Enter a number for generating a number for player1");
                        e=sc.nextInt();
                        x=1+(int)(Math.random()*6);
                        System.out.println("The generated number for player21is:"+y);
                        if(y==x)
                        {
                            System.out.println("oohh ! That's out");
                            System.out.println("Total runs made by player2 is:"+runs2);
                            target=runs2+1;
                            System.out.println("Now the target for player1 is:"+target);
                            break;
                        }
                    }
                    System.out.println("Total runs made by player2 is:"+runs2);
                    target=runs1+1;
                    System.out.println("Now the target for player1 is:"+target);
                    System.out.println("Cheerup guys ! the second innings is starting");
                    for(j=1;j<=6;j++)
                    {
                        e=0;d=0;
                        System.out.println("Enter a number for generating a number for player1");
                        e=sc.nextInt();
                        x=1+(int)(Math.random()*6);
                        System.out.println("The generated number for player1 is:"+x);
                        runs1=runs1+x;
                        System.out.println("Enter a number for generating a number for player2");
                        d=sc.nextInt();
                        y=1+(int)(Math.random()*6);
                        System.out.println("The generated number for player2 is:"+y);
                        if(y==x)
                        {
                            System.out.println("oohh ! That's out");
                            System.out.println("Total runs made by player1 is:"+runs1);
                            if(target==runs1)
                            {
                            System.out.println("oohh ! It's a draw");
                            break;
                            }   
                            else
                            {
                                System.out.println("Wow ! player2 wins ");
                                System.out.println("Better luck next time player1");
                                break;
                            }
                        }
                        else if(runs1>target)
                        {
                            System.out.println("Wow ! player1 wins");
                            System.out.println("Better luck next time player2");
                            break;
                        }
                        
                }
                }
                else if(choice==2)
                {
                    System.out.println("OK ! Player2 chooses bowling");
                    System.out.println("Now the first innings is starting");
                    for(i=1;i<=6;i++)
                    {
                        e=0;d=0;
                        System.out.println("Enter a number for generating a number fot player1");
                        e=sc.nextInt();
                        x=1+(int)(Math.random()*6);
                        System.out.println("The generated number for player1 is:"+x);
                        runs1=runs1+x;
                        System.out.println("Enter a number for generating a number for player2");
                        d=sc.nextInt();
                        y=1+(int)(Math.random()*6);
                        System.out.println("The generated number for player2 is:"+y);
                        if(x==y)
                        {
                            System.out.println("oohh ! That's out");
                            System.out.println("Total runs made by player1 is:"+runs1);
                            target=runs1+1;
                            System.out.println("Now the target for player2 is:"+target);
                            break;
                        }
                    }
                    System.out.println("Total runs made by player1 is:"+runs1);
                    target=runs1+1;
                    System.out.println("Now the target for player2 is:"+target);
                    System.out.println("Cheerup guys ! the second innings is starting");
                    for(j=1;j<=6;j++)
                    {
                        e=0;d=0;
                        System.out.println("Enter a number for generating a number for player2");
                        d=sc.nextInt();
                        y=1+(int)(Math.random()*6);
                        System.out.println("The generated number for player2 is:"+y);
                        runs2=runs2+y;
                        System.out.println("Enter a number for generating a number for player1");
                        e=sc.nextInt();
                        x=+(int)(Math.random()*6);
                        System.out.println("The generated number for player1 is:"+x);
                        if(y==x)
                        {
                            System.out.println("oohh ! That's out");
                            System.out.println("Total runs made by player2 is:"+runs2);
                            if(target==runs2)
                            {
                            System.out.println("oohh ! It's a draw");
                            break;
                            }   
                            else
                            {
                                System.out.println("Wow ! player1 wins ");
                                System.out.println("Better luck next time player2");
                                break;
                            }
                    }
                        else if(runs2>target)
                        {
                            System.out.println("Wow ! player2 wins");
                            System.out.println("Better luck next time player1");
                            break;
                        }
                        
                    }
                }
                else
                {
                    System.out.println("The entered choice is wrong");
                }
        
            }
        }
        else if(c==2)
        {
            System.out.println("player2 chooses even");
            System.out.println("player1 chooses odd");
            System.out.println("Enter a number for player1");
            a=sc.nextInt();
            System.out.println("Enter a number for player2");
            b=sc.nextInt();
            s=a+b;
            if(s%2==0)
            {
                System.out.println("Wow ! player2 wins");
                System.out.println("Better luck next time player1");
                System.out.println("Enter a choice for player2 /n 1.for batting /n 2.for bowling");
                choice=sc.nextInt();
                if(choice==1)
                {
                    System.out.println("OK ! player2 chooses for batting");
                    System.out.println("Now the first innings is starting");
                    for(i=1;i<=6;i++)
                    {
                        e=0;d=0;
                        System.out.println("Enter a number for generating a number fot player2");
                        d=sc.nextInt();
                        y=1+(int)(Math.random()*6);
                        System.out.println("The generated number for player2 is:"+x);
                        runs2=runs2+y;
                        System.out.println("Enter a number for generating a number for player1");
                        e=sc.nextInt();
                        x=1+(int)(Math.random()*6);
                        System.out.println("The generated number for player21is:"+y);
                        if(y==x)
                        {
                            System.out.println("oohh ! That's out");
                            System.out.println("Total runs made by player2 is:"+runs2);
                            target=runs2+1;
                            System.out.println("Now the target for player1 is:"+target);
                            break;
                        }
                    }
                    System.out.println("Total runs made by player2 is:"+runs2);
                    target=runs1+1;
                    System.out.println("Now the target for player1 is:"+target);
                    System.out.println("Cheerup guys ! the second innings is starting");
                    for(j=1;j<=6;j++)
                    {
                        e=0;d=0;
                        System.out.println("Enter a number for generating a number for player1");
                        e=sc.nextInt();
                        x=1+(int)(Math.random()*6);
                        System.out.println("The generated number for player1 is:"+x);
                        runs1=runs1+x;
                        System.out.println("Enter a number for generating a number for player2");
                        d=sc.nextInt();
                        y=1+(int)(Math.random()*6);
                        System.out.println("The generated number for player2 is:"+y);
                        if(y==x)
                        {
                            System.out.println("oohh ! That's out");
                            System.out.println("Total runs made by player1 is:"+runs1);
                            if(target==runs1)
                            {
                            System.out.println("oohh ! It's a draw");
                            break;
                            }   
                            else
                            {
                                System.out.println("Wow ! player2 wins ");
                                System.out.println("Better luck next time player1");
                                break;
                            }
                        }
                        else if(runs1>target)
                        {
                            System.out.println("Wow ! player1 wins");
                            System.out.println("Better luck next time player2");
                            break;
                        }
                        
                }
                }
                else if(choice==2)
                {
                    System.out.println("OK ! Player2 chooses bowling");
                    System.out.println("Now the first innings is starting");
                    for(i=1;i<=6;i++)
                    {
                        e=0;d=0;
                        System.out.println("Enter a number for generating a number fot player1");
                        e=sc.nextInt();
                        x=1+(int)(Math.random()*6);
                        System.out.println("The generated number for player1 is:"+x);
                        runs1=runs1+x;
                        System.out.println("Enter a number for generating a number for player2");
                        d=sc.nextInt();
                        y=1+(int)(Math.random()*6);
                        System.out.println("The generated number for player2 is:"+y);
                        if(x==y)
                        {
                            System.out.println("oohh ! That's out");
                            System.out.println("Total runs made by player1 is:"+runs1);
                            target=runs1+1;
                            System.out.println("Now the target for player2 is:"+target);
                            break;
                        }
                    }
                    System.out.println("Total runs made by player1 is:"+runs1);
                    target=runs1+1;
                    System.out.println("Now the target for player2 is:"+target);
                    System.out.println("Cheerup guys ! the second innings is starting");
                    for(j=1;j<=6;j++)
                {
                    e=0;d=0;
                        System.out.println("Enter a number for generating a number for player2");
                        d=sc.nextInt();
                        y=1+(int)(Math.random()*6);
                        System.out.println("The generated number for player2 is:"+x);
                        runs2=runs2+y;
                        System.out.println("Enter a number for generating a number for player1");
                        e=sc.nextInt();
                        x=1+(int)(Math.random()*6);
                        System.out.println("The generated number for player1 is:"+y);
                        if(y==x)
                        {
                            System.out.println("oohh ! That's out");
                            System.out.println("Total runs made by player2 is:"+runs1);
                            if(target==runs1)
                            {
                            System.out.println("oohh ! It's a draw");
                            break;
                            }   
                            else
                            {
                                System.out.println("Wow ! player1 wins ");
                                System.out.println("Better luck next time player2");
                                break;
                            }
                        }
                        else if(runs2>target)
                        {
                            System.out.println("Wow ! player2 wins");
                            System.out.println("Better luck next time player1");
                            break;
                        }  
                }
                    }
                    else
                    {  
                    System.out.println("The entered choice is wrong");
                    }
                }
                else
                {
                    System.out.println("Wow ! player2 wins");
                System.out.println("Better luck next time player1");
                System.out.println("Enter a choice for player2 /n 1.for batting /n 2.for bowling");
                choice=sc.nextInt();
                if(choice==1)
                {
                    System.out.println("OK ! player2 chooses for batting");
                    System.out.println("Now the first innings is starting");
                    for(i=1;i<=6;i++)
                    {
                        e=0;d=0;
                        System.out.println("Enter a number for generating a number fot player2");
                        d=sc.nextInt();
                        y=1+(int)(Math.random()*6);
                        System.out.println("The generated number for player2 is:"+x);
                        runs2=runs2+y;
                        System.out.println("Enter a number for generating a number for player1");
                        e=sc.nextInt();
                        x=1+(int)(Math.random()*6);
                        System.out.println("The generated number for player21is:"+y);
                        if(y==x)
                        {
                            System.out.println("oohh ! That's out");
                            System.out.println("Total runs made by player2 is:"+runs2);
                            target=runs2+1;
                            System.out.println("Now the target for player1 is:"+target);
                            break;
                        }
                    }
                    System.out.println("Total runs made by player2 is:"+runs2);
                    target=runs1+1;
                    System.out.println("Now the target for player1 is:"+target);
                    System.out.println("Cheerup guys ! the second innings is starting");
                    for(j=1;j<=6;j++)
                    {
                        e=0;d=0;
                        System.out.println("Enter a number for generating a number for player1");
                        e=sc.nextInt();
                        x=1+(int)(Math.random()*6);
                        System.out.println("The generated number for player1 is:"+x);
                        runs1=runs1+x;
                        System.out.println("Enter a number for generating a number for player2");
                        d=sc.nextInt();
                        y=1+(int)(Math.random()*6);
                        System.out.println("The generated number for player2 is:"+y);
                        if(y==x)
                        {
                            System.out.println("oohh ! That's out");
                            System.out.println("Total runs made by player1 is:"+runs1);
                            if(target==runs1)
                            {
                            System.out.println("oohh ! It's a draw");
                            break;
                            }   
                            else
                            {
                                System.out.println("Wow ! player2 wins ");
                                System.out.println("Better luck next time player1");
                                break;
                            }
                        }
                        else if(runs1>target)
                        {
                            System.out.println("Wow ! player1 wins");
                            System.out.println("Better luck next time player2");
                            break;
                        }
                        
                }
                }
                else if(choice==2)
                {
                    System.out.println("OK ! Player2 chooses bowling");
                    System.out.println("Now the first innings is starting");
                    for(i=1;i<=6;i++)
                    {
                        e=0;d=0;
                        System.out.println("Enter a number for generating a number fot player1");
                        e=sc.nextInt();
                        x=1+(int)(Math.random()*6);
                        System.out.println("The generated number for player1 is:"+x);
                        runs1=runs1+x;
                        System.out.println("Enter a number for generating a number for player2");
                        d=sc.nextInt();
                        y=1+(int)(Math.random()*6);
                        System.out.println("The generated number for player2 is:"+y);
                        if(x==y)
                        {
                            System.out.println("oohh ! That's out");
                            System.out.println("Total runs made by player1 is:"+runs1);
                            target=runs1+1;
                            System.out.println("Now the target for player2 is:"+target);
                            break;
                        }
                    }
                    System.out.println("Total runs made by player1 is:"+runs1);
                    target=runs1+1;
                    System.out.println("Now the target for player2 is:"+target);
                    System.out.println("Cheerup guys ! the second innings is starting");
                    for(j=1;j<=6;j++)
                    {
                        e=0;d=0;
                        System.out.println("Enter a number for generating a number for player2");
                        d=sc.nextInt();
                        y=1+(int)(Math.random()*6);
                        System.out.println("The generated number for player2 is:"+y);
                        runs2=runs2+y;
                        System.out.println("Enter a number for generating a number for player1");
                        e=sc.nextInt();
                        x=+(int)(Math.random()*6);
                        System.out.println("The generated number for player1 is:"+x);
                        if(y==x)
                        {
                            System.out.println("oohh ! That's out");
                            System.out.println("Total runs made by player2 is:"+runs2);
                            if(target==runs2)
                            {
                            System.out.println("oohh ! It's a draw");
                            break;
                            }   
                            else
                            {
                                System.out.println("Wow ! player1 wins ");
                                System.out.println("Better luck next time player2");
                                break;
                            }
                        }
                        else if(runs2>target)
                        {
                            System.out.println("Wow ! player2 wins");
                            System.out.println("Better luck next time player1");
                            break;
                        }
                        
                    }
                }
                else
                {
                    System.out.println("The entered choice is wrong");
                }
        
            }

                }
                else 
                {
                    System.out.println("The entered choice is wrong");
                }
        }

    }