import org.junit.Assert;
import org.junit.Test;

public class Tests {
  @Test
  public void testDefaultConstructor() {
    Spacecraft s = new Spacecraft();
    Assert.assertTrue("x-coordinate should be 0", s.position().getX() == 0);
    Assert.assertTrue("y-coordinate should be 0", s.position().getY() == 0);
    Assert.assertTrue("Height should be equal to 1", s.height() == 1);
    Assert.assertTrue("Width should be equal to 1", s.width() == 1);
  }

  protected void testSqConstructor(int side) {
    Spacecraft s = new Spacecraft(side);
    Assert.assertTrue("x-coordinate should be 0", s.position().getX() == 0);
    Assert.assertTrue("y-coordinate should be 0", s.position().getY() == 0);
    Assert.assertTrue("For new Spacecraft(" + side + "), the height should be equal to " + side, s.height() == side);
    Assert.assertTrue("For new Spacecraft(" + side + "), the width should be equal to " + side, s.width() == side);
  }

  @Test
  public void testSqConstructor1() {
    testSqConstructor(1);
  }

  @Test
  public void testSqConstructor62() {
    testSqConstructor(62);
  }

  @Test
  public void testSqConstructor200() {
    testSqConstructor(200);
  }

  protected void testConstructor(int width, int height) {
    Spacecraft s = new Spacecraft(width, height);
    Assert.assertTrue("x-coordinate should be 0", s.position().getX() == 0);
    Assert.assertTrue("y-coordinate should be 0", s.position().getY() == 0);
    Assert.assertTrue("For new Spacecraft(" + width + ", " + height + "), the height should be equal to " + height, s.height() == height);
    Assert.assertTrue("For new Spacecraft(" + width + ", " + height + "), the width should be equal to " + width, s.width() == width);
  }

  @Test
  public void testConstructor1() {
    testConstructor(1, 1);
  }

  @Test
  public void testConstructor2() {
    testConstructor(1, 2);
  }

  @Test
  public void testConstructor3() {
    testConstructor(20, 19);
  }

  @Test
  public void testConstructor4() {
    testConstructor(261, 200);
  }

  protected void testArea(int width, int height) {
    Spacecraft s = new Spacecraft(width, height);
    int area = width * height;
    Assert.assertEquals("Incorrect area for new Spacecraft(" + width + ", " + height + ")", area, s.area());
  }

  @Test
  public void testArea1() {
    testArea(1, 1);
  }

  @Test
  public void testArea2() {
    testArea(1, 2);
  }

  @Test
  public void testArea3() {
    testArea(20, 19);
  }

  @Test
  public void testArea4() {
    testArea(261, 200);
  }

  @Test
  public void testArea5() {
    testArea(47, 47);
  }

  protected void testPerimeter(int width, int height) {
    Spacecraft s = new Spacecraft(width, height);
    int perimeter = (width + height) * 2;
    Assert.assertEquals("Incorrect perimeter for new Spacecraft(" + width + ", " + height + ")", perimeter, s.perimeter());
  }

  @Test
  public void testPerimeter1() {
    testPerimeter(1, 1);
  }

  @Test
  public void testPerimeter2() {
    testPerimeter(1, 2);
  }

  @Test
  public void testPerimeter3() {
    testPerimeter(20, 19);
  }

  @Test
  public void testPerimeter4() {
    testPerimeter(261, 200);
  }

  @Test
  public void testPerimeter5() {
    testPerimeter(47, 47);
  }

  protected void checkSpacecraft(Spacecraft s, int width, int height, int x, int y) {
    Assert.assertTrue("For s.setPosition(" + x + ", " + y + "), the x-coordinate should be " + x, s.position().getX() == x);
    Assert.assertTrue("For s.setPosition(" + x + ", " + y + "), the y-coordinate should be " + y, s.position().getY() == y);
    Assert.assertTrue("For new Spacecraft(" + width + ", " + height + "), the height should be equal to " + height, s.height() == height);
    Assert.assertTrue("For new Spacecraft(" + width + ", " + height + "), the width should be equal to " + width, s.width() == width);
  }

  @Test
  public void testSetPosition1() {
    Spacecraft s = new Spacecraft();
    checkSpacecraft(s, 1, 1, 0, 0);
    s.setPosition(25, 47);
    checkSpacecraft(s, 1, 1, 25, 47);
    s.setPosition(20, 19);
    checkSpacecraft(s, 1, 1, 20, 19);
  }

  @Test
  public void testSetPosition2() {
    Spacecraft s = new Spacecraft(17);
    checkSpacecraft(s, 17, 17, 0, 0);
    s.setPosition(25, 47);
    checkSpacecraft(s, 17, 17, 25, 47);
    s.setPosition(20, 19);
    checkSpacecraft(s, 17, 17, 20, 19);
  }

  @Test
  public void testSetPosition3() {
    Spacecraft s = new Spacecraft(20, 19);
    checkSpacecraft(s, 20, 19, 0, 0);
    s.setPosition(25, 47);
    checkSpacecraft(s, 20, 19, 25, 47);
    s.setPosition(20, 19);
    checkSpacecraft(s, 20, 19, 20, 19);
  }

  @Test
  public void testSetSize1() {
    Spacecraft s = new Spacecraft();
    s.setSize(47);
    checkSpacecraft(s, 47, 47, 0, 0);
    s.setPosition(261, 200);
    checkSpacecraft(s, 47, 47, 261, 200);
  }

  @Test
  public void testSetSize2() {
    Spacecraft s = new Spacecraft(62);
    s.setSize(47);
    checkSpacecraft(s, 47, 47, 0, 0);
    s.setPosition(261, 200);
    checkSpacecraft(s, 47, 47, 261, 200);
  }

  @Test
  public void testSetSize3() {
    Spacecraft s = new Spacecraft(20, 19);
    s.setSize(47);
    checkSpacecraft(s, 47, 47, 0, 0);
    s.setPosition(261, 200);
    checkSpacecraft(s, 47, 47, 261, 200);
  }

  @Test
  public void testSetSize4() {
    Spacecraft s = new Spacecraft();
    s.setSize(25, 47);
    checkSpacecraft(s, 25, 47, 0, 0);
    s.setPosition(261, 200);
    checkSpacecraft(s, 25, 47, 261, 200);
  }

  @Test
  public void testSetSize5() {
    Spacecraft s = new Spacecraft(62);
    s.setSize(20, 19);
    checkSpacecraft(s, 20, 19, 0, 0);
    s.setPosition(261, 200);
    checkSpacecraft(s, 20, 19, 261, 200);
  }

  @Test
  public void testSetSize6() {
    Spacecraft s = new Spacecraft(20, 19);
    s.setSize(261, 200);
    checkSpacecraft(s, 261, 200, 0, 0);
    s.setPosition(261, 200);
    checkSpacecraft(s, 261, 200, 261, 200);
  }

  protected void checkPoint(Point p, int x, int y)  {
    Assert.assertEquals("Incorrect x-coordinate.", x, p.getX());
    Assert.assertEquals("Incorrect y-coordinate.", y, p.getY());
  }

  protected void testPoint(int x, int y) {
    Point p = new Point(x, y);
    checkPoint(p, x, y);
  }

  @Test
  public void testPoint1() {
    testPoint(0, 0);
  }

  @Test
  public void testPoint2() {
    testPoint(0, 1);
  }

  @Test
  public void testPoint3() {
    testPoint(1, 0);
  }

  @Test
  public void testPoint4() {
    testPoint(261, 200);
  }

  @Test
  public void testSpacecraftToString() {
    Spacecraft s = new Spacecraft(25, 62);
    s.setPosition(261, 200);
    Assert.assertEquals("Incorrect string output", "Spacecraft at position (261, 200), with width 25 and height 62", s.toString());
  }

  @Test
  public void testPointToString() {
    Point p = new Point(20, 19);
    Assert.assertEquals("Incorrect string output", "(20, 19)", p.toString());
  }

  @Test
  public void testPointMutateX() {
    Point p = new Point(20, 19);
    checkPoint(p, 20, 19);
    Point q = p.mutateX(25);
    checkPoint(p, 20, 19);
    checkPoint(q, 25, 19);
  }

  @Test
  public void testPointMutateY() {
    Point p = new Point(20, 19);
    checkPoint(p, 20, 19);
    Point q = p.mutateY(62);
    checkPoint(p, 20, 19);
    checkPoint(q, 20, 62);
  }

  @Test
  public void testCornerPoints1() {
    Spacecraft s = new Spacecraft(20, 18);
    Point ll = s.lowerLeft();
    checkPoint(ll, -10, -9);
    Point ur = s.upperRight();
    checkPoint(ur, 10, 9);
  }

  @Test
  public void testCornerPoints2() {
    Spacecraft s = new Spacecraft(261, 103);
    Point ll = s.lowerLeft();
    checkPoint(ll, -131, -52);
    Point ur = s.upperRight();
    checkPoint(ur, 131, 52);
  }

  @Test
  public void testCornerPoints3() {
    Spacecraft s = new Spacecraft(20, 18);
    s.setPosition(261, 200);
    Point ll = s.lowerLeft();
    checkPoint(ll, 251, 191);
    Point ur = s.upperRight();
    checkPoint(ur, 271, 209);
  }

  @Test
  public void testCornerPoints4() {
    Spacecraft s = new Spacecraft(261, 103);
    s.setPosition(261, 200);
    Point ll = s.lowerLeft();
    checkPoint(ll, 130, 148);
    Point ur = s.upperRight();
    checkPoint(ur, 392, 252);
  }

  @Test
  public void testSpacecraftCount() {
    int origCount = Spacecraft.count();
    new Spacecraft();
    Assert.assertEquals("Incorrect number of spacecrafts in the system",origCount+1, Spacecraft.count());
    Assert.assertEquals("Incorrect number of spacecrafts in the system",origCount+1, Spacecraft.count());
    new Spacecraft();
    Assert.assertEquals("Incorrect number of spacecrafts in the system",origCount+2, Spacecraft.count());
    Assert.assertEquals("Incorrect number of spacecrafts in the system",origCount+2, Spacecraft.count());
    new Spacecraft(2562);
    Assert.assertEquals("Incorrect number of spacecrafts in the system",origCount+3, Spacecraft.count());
    Assert.assertEquals("Incorrect number of spacecrafts in the system",origCount+3, Spacecraft.count());
    new Spacecraft(2019);
    Assert.assertEquals("Incorrect number of spacecrafts in the system",origCount+4, Spacecraft.count());
    Assert.assertEquals("Incorrect number of spacecrafts in the system",origCount+4, Spacecraft.count());
    new Spacecraft(25, 47);
    Assert.assertEquals("Incorrect number of spacecrafts in the system",origCount+5, Spacecraft.count());
    Assert.assertEquals("Incorrect number of spacecrafts in the system",origCount+5, Spacecraft.count());
    Spacecraft s = new Spacecraft(261, 200);
    Assert.assertEquals("Incorrect number of spacecrafts in the system",origCount+6, Spacecraft.count());
    s.setPosition(25, 62);
    Assert.assertEquals("Incorrect number of spacecrafts in the system",origCount+6, Spacecraft.count());
    s.setSize(17);
    Assert.assertEquals("Incorrect number of spacecrafts in the system",origCount+6, Spacecraft.count());
    s.setSize(20, 19);
    Assert.assertEquals("Incorrect number of spacecrafts in the system",origCount+6, Spacecraft.count());
    s.lowerLeft();
    s.upperRight();
    s.area();
    s.perimeter();
    Assert.assertEquals("Incorrect number of spacecrafts in the system",origCount+6, Spacecraft.count());
  }

  @Test
  public void testViewport() {
    Point ll = Spacecraft.viewportLowerLeft();
    Point ur = Spacecraft.viewportUpperRight();
    Spacecraft s = new Spacecraft();
    Point ll_, ur_;

    s.setPosition(ll.getX()-1, ll.getY());
    ll_ = Spacecraft.viewportLowerLeft();
    ur_ = Spacecraft.viewportUpperRight();
    checkPoint(ll_, ll.getX()-1, ll.getY());
    checkPoint(ur_, ur.getX(), ur.getY());

    s.setPosition(ll.getX(), ll.getY()-2);
    ll_ = Spacecraft.viewportLowerLeft();
    ur_ = Spacecraft.viewportUpperRight();
    checkPoint(ll_, ll.getX()-1, ll.getY()-2);
    checkPoint(ur_, ur.getX(), ur.getY());

    s.setPosition(ur.getX()+3, ur.getY());
    ll_ = Spacecraft.viewportLowerLeft();
    ur_ = Spacecraft.viewportUpperRight();
    checkPoint(ll_, ll.getX()-1, ll.getY()-2);
    checkPoint(ur_, ur.getX()+3, ur.getY());

    s.setPosition(ur.getX(), ur.getY()+4);
    ll_ = Spacecraft.viewportLowerLeft();
    ur_ = Spacecraft.viewportUpperRight();
    checkPoint(ll_, ll.getX()-1, ll.getY()-2);
    checkPoint(ur_, ur.getX()+3, ur.getY()+4);

    s.setPosition(ll.getX(), ll.getY());
    ll_ = Spacecraft.viewportLowerLeft();
    ur_ = Spacecraft.viewportUpperRight();
    checkPoint(ll_, ll.getX()-1, ll.getY()-2);
    checkPoint(ur_, ur.getX()+3, ur.getY()+4);

    s.setPosition(ur.getX(), ur.getY());
    ll_ = Spacecraft.viewportLowerLeft();
    ur_ = Spacecraft.viewportUpperRight();
    checkPoint(ll_, ll.getX()-1, ll.getY()-2);
    checkPoint(ur_, ur.getX()+3, ur.getY()+4);
  }
}