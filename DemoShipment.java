class Box
{
  double width, height, depth;
  Box(Box ob)
  {
    width = ob.width;
    height = ob.height;
    depth = ob.depth;
  }

  Box(double w, double h, double d)
  {
    width = w;
    height = h;
    depth = d;
  }

  Box()
  {
    width = -1;
    height = -1;
    depth = -1;
  }

  Box(double len)
  {
    width = height = depth = len;
  }

  double volume()
  {
    return width*height*depth;
  }
}

class BoxWeight extends Box
{
  double weight;
  BoxWeight(BoxWeight ob)
  {
    super(ob);
    weight = ob.weight;
  }

  BoxWeight(double w, double h, double d, double m)
  {
    super(w,h,d);
    weight = m;
  }

  BoxWeight()
  {
    super();
    weight = -1;
  }

  BoxWeight(double len, double m)
  {
    super(len);
    weight = m;
  }
}

class Shipment extends BoxWeight
{
  double cost;
  Shipment(Shipment ob)
  {
    super(ob);
    cost = ob.cost;
  }

  Shipment(double w, double h, double d, double m, double c)
  {
    super(w,h,d,m);
    cost = c;
  }

  Shipment()
  {
    super();
    cost = -1;
  }

  Shipment(double len, double m, double c)
  {
    super(len, m);
    cost = c;
  }
}

class DemoShipment
{
  public static void main(String args[])
  {
    Shipment s1 = new Shipment(10,20,15,10,3.14);
    double vol;
    vol = s1.volume();
    System.out.println("Volume of Shipment: " + vol); 
    System.out.println("Weight of Shipment: " + s1.weight);
    System.out.println("Cost of Shipment: " + s1.cost);

    Shipment s2 = new Shipment(2,3,4);
    vol = s2.volume();
    System.out.println("Volume of Shipment: " + vol);
    System.out.println("Weight of Shipment: " + s2.weight);
    System.out.println("Cost of Shipment: " + s2.cost);
  }
}
