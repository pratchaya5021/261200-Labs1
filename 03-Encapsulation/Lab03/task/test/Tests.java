import org.junit.Assert;
import org.junit.Test;

public class Tests {
    @Test
    public void testDefaultConstructor() {
        Spacecraft s = new Spacecraft();
        Assert.assertTrue("x-coordinate should be 0", s.x == 0);
        Assert.assertTrue("y-coordinate should be 0", s.y == 0);
        Assert.assertTrue("Height should be equal to 1", s.height == 1);
        Assert.assertTrue("Width should be equal to 1", s.width == 1);
    }

    protected void testSqConstructor(int side) {
        Spacecraft s = new Spacecraft(side);
        Assert.assertTrue("x-coordinate should be 0", s.x == 0);
        Assert.assertTrue("y-coordinate should be 0", s.y == 0);
        Assert.assertTrue("For new Spacecraft(" + side + "), the height should be equal to " + side, s.height == side);
        Assert.assertTrue("For new Spacecraft(" + side + "), the width should be equal to " + side, s.width == side);
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
        Assert.assertTrue("x-coordinate should be 0", s.x == 0);
        Assert.assertTrue("y-coordinate should be 0", s.y == 0);
        Assert.assertTrue("For new Spacecraft(" + width + ", " + height + "), the height should be equal to " + height, s.height == height);
        Assert.assertTrue("For new Spacecraft(" + width + ", " + height + "), the width should be equal to " + width, s.width == width);
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
        Assert.assertTrue("For s.setPosition(" + x + ", " + y + "), the x-coordinate should be " + x, s.x == x);
        Assert.assertTrue("For s.setPosition(" + x + ", " + y + "), the y-coordinate should be " + y, s.y == y);
        Assert.assertTrue("For new Spacecraft(" + width + ", " + height + "), the height should be equal to " + height, s.height == height);
        Assert.assertTrue("For new Spacecraft(" + width + ", " + height + "), the width should be equal to " + width, s.width == width);
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

}